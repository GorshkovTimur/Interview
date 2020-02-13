package com.timmyg.interviewcourse;

import com.timmyg.interviewcourse.data.ConvertTo;
import com.timmyg.interviewcourse.data.Converter;
import com.timmyg.interviewcourse.data.ConverterKg2Lb;
import com.timmyg.interviewcourse.data.ConverterMeters2Feet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Test
    public void Converter_Convert_UnitTest() {
        ConvertTo convert = Mockito.mock(ConvertTo.class);
        float source = 1.0f;
        Converter converter = new Converter(source);
        converter.convert(convert);
        Mockito.verify(convert).Do(1.0f);

    }

    @Test
    public void ConverterKg2Lb_IntegrationTest(){
        float source = 1.0f;
        Converter converter = new Converter(source);
        float result = converter.convert(new ConverterKg2Lb());
        Assert.assertEquals(2.20f, result, 0.05f);
    }

    @Test
    public void ConverterMeters2Feet_IntegrationTest(){
        float source = 1.0f;
        Converter converter = new Converter(source);
        float result = converter.convert(new ConverterMeters2Feet());
        Assert.assertEquals(3.28f, result,0.05f);
    }


}