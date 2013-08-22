package com.musicplayertest;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.hck.music.bean.MusicBean;
import com.hck.music.ui.PlayMusicActivity;
public class MainActivity extends Activity {
	private MusicBean bean;
	private ArrayList<MusicBean> beans;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	private void initDate1() {
		bean = new MusicBean();
		beans=new ArrayList<MusicBean>();
		bean.setId(1);
		bean.setMusicImage("http://218.200.230.40:18089/files/resize/album/2013-07-09/1307091529086268.jpg?400x400");
		bean.setMusicLrcUrl("http://open.migu.cn:8100/product/music/3/000021/2013/06/29/d08383f4823f552e353ef64fb7df695d_000021_3.lrc?m");
		bean.setMusicPlayUrl("http://open.migu.cn:8100/product/music/3/000019/2013/06/29/d08383f4823f552e353ef64fb7df695d_000019_3.mp3?m");
		bean.setMusicName("我们在一起");
		beans.add(bean);
		
		bean = new MusicBean();
		bean.setId(2);
		bean.setMusicImage("http://218.200.230.40:18089/files/resize/album/2013-07-10/1307101004482065.jpg?400x400");
		bean.setMusicLrcUrl("http://open.migu.cn:8100/product/music/3/000021/2013/08/19/a35641e743e9d19bf4cacc59a1eb8370_3.lrc?m");
		bean.setMusicPlayUrl("http://open.migu.cn:8100/product/music/3/000019/2013/08/19/a35641e743e9d19bf4cacc59a1eb8370_3.mp3?m");
		bean.setMusicName("江南style");
		beans.add(bean);
	}
	private void initDate2() {
		bean = new MusicBean();
		beans=new ArrayList<MusicBean>();
		bean.setId(1);
		bean.setMusicImage("");
		bean.setMusicLrcUrl("");
		bean.setMusicPlayUrl("/mnt/sdcard/music/万物生.mp3");
		bean.setMusicName("万物生");
		beans.add(bean);
		
		bean = new MusicBean();
		bean.setId(2);
		bean.setMusicImage("");
		bean.setMusicLrcUrl("");
		bean.setMusicPlayUrl("/mnt/sdcard/music/流着泪的你的脸.mp3");
		bean.setMusicName("流着泪的你的脸");
		beans.add(bean);
	}
	public void playMusic1(View view) {
		initDate1();
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, PlayMusicActivity.class);
		intent.putExtra("music", beans.toArray());
		intent.putExtra("id", 0);
		intent.putExtra("type", "net");
		startActivity(intent);
	}
	public void playMusic2(View view) {
		initDate2();
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, PlayMusicActivity.class);
		intent.putExtra("music", beans.toArray());
		intent.putExtra("id", 0);
		intent.putExtra("type", "local");
		startActivity(intent);
	}
}
