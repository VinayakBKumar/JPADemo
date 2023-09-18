package com.vidhya.jpademo;

import com.vidhya.jpademo.jt_models.JT_Mentor;
import com.vidhya.jpademo.jt_models.JT_MentorRepository;
import com.vidhya.jpademo.ms_models.MS_Mentor;
import com.vidhya.jpademo.ms_models.MS_MentorRepository;
import com.vidhya.jpademo.st_models.ST_Mentor;
import com.vidhya.jpademo.st_models.ST_MentorRepository;
import com.vidhya.jpademo.tc_models.TC_Mentor;
import com.vidhya.jpademo.tc_models.TC_MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private JT_MentorRepository jt_mentorRepository;
    private MS_MentorRepository ms_mentorRepository;
    private ST_MentorRepository st_mentorRepository;
    private TC_MentorRepository tc_mentorRepository;

    public JpaDemoApplication(JT_MentorRepository jt_mentorRepository,
                              MS_MentorRepository  ms_mentorRepository,
                              ST_MentorRepository st_mentorRepository,
                              TC_MentorRepository tc_mentorRepository){
        this.jt_mentorRepository = jt_mentorRepository;
        this.ms_mentorRepository = ms_mentorRepository;
        this.st_mentorRepository = st_mentorRepository;
        this.tc_mentorRepository = tc_mentorRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        JT_Mentor jt_mentor = new JT_Mentor();

        jt_mentor.setName("Vid");
        jt_mentor.setEmail("vid@google.com");
        jt_mentor.setAvgRating(3.5);

        jt_mentorRepository.save(jt_mentor);

        MS_Mentor ms_mentor = new MS_Mentor();
        ms_mentor.setName("msvid");
        ms_mentor.setEmail("msvid@google.com");
        ms_mentor.setAvgRating(4);

        ms_mentorRepository.save(ms_mentor);


        ST_Mentor st_mentor = new ST_Mentor();
        st_mentor.setName("stvid");
        st_mentor.setEmail("stvid@google.com");
        st_mentor.setAvgRating(5);

        st_mentorRepository.save(st_mentor);

        TC_Mentor tc_mentor = new TC_Mentor();
        tc_mentor.setName("tcvid");
        tc_mentor.setEmail("tcvid@google.com");
        tc_mentor.setAvgRating(3.6);

        tc_mentorRepository.save(tc_mentor);
    }
}
