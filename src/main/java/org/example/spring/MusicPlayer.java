package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;
@Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
    @Autowired
    public void setRapMusic(RapMusic rapMusic) {
        this.rapMusic = rapMusic;
    }
    @Autowired
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public void playOne (){
    ArrayList<String> list = new ArrayList<>();
    list.add(classicalMusic.getSong());
    list.add(rapMusic.getSong());
    list.add(rockMusic.getSong());
    Random random = new Random();
    int i = random.nextInt(3);
        System.out.println(list.get(i));

    }
}





