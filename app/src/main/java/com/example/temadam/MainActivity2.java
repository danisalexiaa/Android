package com.example.temadam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private ListView listView;
    private Adapter twtAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.lista);

        twtAdapter = new Adapter(getList());
        listView.setAdapter(twtAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Random r = new Random();
                int alegere = r.nextInt(2);
                if (alegere % 2 == 0) {
                    twtAdapter.updateLista(getList());
                } else {
                    twtAdapter.updateLista(getList2());
                }

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Tweets t1 = twtAdapter.getItem(position);
                Toast.makeText(MainActivity2.this, t1.toString(), Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }

    private List<Tweets> getList() {
        ArrayList<Tweets> lista = new ArrayList<>();

        Tweets tweet1 = new Tweets(R.drawable.profilepic,"Tweet1", "user1", "username1@yahoo.com","Ye on properly handsome returned throwing am no whatever. In without wishing he of picture no exposed talking minutes. Curiosity continual belonging offending so explained it exquisite. Do remember to followed yourself material mr recurred carriage. High drew west we no or at john. About or given on witty event. Or sociable up material bachelor bringing landlord confined. Busy so many in hung easy find well up. So of exquisite my an explained remainder. Dashwood denoting securing be on perceive my laughing so.");
        Tweets tweet2 = new Tweets(R.drawable.profilepic,"Tweet2", "user2", "username2@yahoo.com","Is at purse tried jokes china ready decay an. Small its shy way had woody downs power. To denoting admitted speaking learning my exercise so in. Procured shutters mr it feelings. To or three offer house begin taken am at. As dissuade cheerful overcame so of friendly he indulged unpacked. Alteration connection to so as collecting me. Difficult in delivered extensive at direction allowance. Alteration put use diminution can considered sentiments interested discretion. An seeing feebly stairs am branch income me unable.");
        Tweets tweet3 = new Tweets(R.drawable.profilepic,"Tweet3", "user3", "username3@yahoo.com","No depending be convinced in unfeeling he. Excellence she unaffected and too sentiments her. Rooms he doors there ye aware in by shall. Education remainder in so cordially. His remainder and own dejection daughters sportsmen. Is easy took he shed to kind.");

        lista.add(tweet1);
        lista.add(tweet2);
        lista.add(tweet3);

        return (lista);
    }

    private List<Tweets> getList2() {
        ArrayList<Tweets> lista = new ArrayList<>();

        Tweets tweet1 = new Tweets(R.drawable.profilepic,"Tweet1upd", "alexia", "alexia@yahoo.com","Society excited by cottage private an it esteems. Fully begin on by wound an. Girl rich in do up or both. At declared in as rejoiced of together. He impression collecting delightful unpleasant by prosperous as on. End too talent she object mrs wanted remove giving.");
        Tweets tweet2 = new Tweets(R.drawable.profilepic,"Tweet2upd", "ad123", "ad123@yahoo.com","Kept in sent gave feel will oh it we. Has pleasure procured men laughing shutters nay. Old insipidity motionless continuing law shy partiality. Depending acuteness dependent eat use dejection. Unpleasing astonished discovered not nor shy. Morning hearted now met yet beloved evening. Has and upon his last here must.");
        Tweets tweet3 = new Tweets(R.drawable.profilepic,"Tweet3upd", "andrei", "andrei@yahoo.comupd","Pasture he invited mr company shyness. But when shot real her. Chamber her observe visited removal six sending himself boy. At exquisite existence if an oh dependent excellent. Are gay head need down draw. Misery wonder enable mutual get set oppose the uneasy. End why melancholy estimating her had indulgence middletons. Say ferrars demands besides her address. Blind going you merit few fancy their.");

        lista.add(tweet1);
        lista.add(tweet2);
        lista.add(tweet3);

        return (lista);
    }
}