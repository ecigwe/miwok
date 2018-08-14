package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
//    private MediaPlayer mMediaPlayer;
//
//
//
//    /**
//     * This listener gets triggered when the {@link MediaPlayer} has completed
//     * playing the audio file.
//     */
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
//
////        String[] words = new String[10];
////        words[0] = "one";
////        words[1]= "two";
////        words[2]= "three";
////        words[3]= "four";
////        words[4]= "five";
////        words[5]= "six";
////        words[6]= "seven";
////        words[7]="eight";
////        words[9]="nine";
////        words[10]="ten";
//
////        ArrayList<String> words = new ArrayList <String>();
////          words.add("one");
////          words.add("two");
////          words.add("three");
////          words.add("four");
//
//        //create a list of words
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("one", "lutti", R.raw.number_one));
//        words.add(new Word("two", "ottico", R.raw.number_two));
//        words.add(new Word("three", "tolokoosu", R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.raw.number_four));
//        words.add(new Word("five", "massoca", R.raw.number_five));
//        words.add(new Word("six", "temmoka", R.raw.number_six));
//        words.add(new Word("seven", "kenukeka", R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.raw.number_eight));
//        words.add(new Word("nine", "woe",R.raw.number_nine));
//        words.add(new Word("ten", "ashas", R.raw.number_ten));
//        words.add(new Word("one", "lutti",R.raw.number_one));
//        words.add(new Word("one", "lutti",R.raw.number_one));
//
//
//
////              LinearLayout rootview = (LinearLayout) findViewById(R.id.rootView);
////              TextView wordview = new TextView(this);
////              wordview.setText(words.get(0));
////              rootview.addView(wordview);
//
////        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
//                Word word =  words.get(position);
//                releaseMediaPlayer();
//
////                Toast.makeText(Numbers.this, "list item called", Toast.LENGTH_SHORT).show();
//                mMediaPlayer = MediaPlayer.create(Phrases.this, word.getAudioResourceId());
//                mMediaPlayer.start();
////trigared when the music player have finished playing
//                mMediaPlayer.setOnCompletionListener(mCompletionListener);
//            }
//        });
//
//
//    }
//
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        //when activity stop release media player
//        releaseMediaPlayer();
//    }
//    /**
//     * Clean up the media player by releasing its resources.
//     */
//    private void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//        }
//

    }

}
