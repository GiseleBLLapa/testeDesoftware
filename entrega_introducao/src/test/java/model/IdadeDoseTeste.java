package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.IdadeDose;

public class IdadeDoseTeste{
    
    @Test
    public void doseTeste(){
        IdadeDose dose = new IdadeDose();
        int vacina = dose.meses(1);
        assertEquals(1,vacina);
    }
}