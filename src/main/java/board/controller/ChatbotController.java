package board.controller;

import java.awt.Button;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import component.response.BasicCard;
import component.response.SimpleText;
import component.response.SkillPalyload;
import component.response.SkillResponse;
import component.response.SkillTemplate;



@RestController
public class ChatbotController {


	@RequestMapping(value="/keyboard")
	@ResponseBody
	public String keyboard() {
		System.out.println("keyboard");
		
		return "keyboard";
	}
	
	@RequestMapping(value="/keyboard/btnClk.do")
	public SkillResponse btnClk(@RequestBody SkillPalyload skillPalyload ) {
		System.out.println("btnClk====");
		SkillResponse skillResponse = new SkillResponse("1.0");
		SkillTemplate skillTemplate = new SkillTemplate();
		BasicCard basicCard = new BasicCard();
		basicCard.setDescrition("스킬데이터가 드디어 되는가 ");
        Button button = new Button( "챗봇연결" , "blockID");
        basicCard.add( button );
		skillTemplate.add( "basicCard", basicCard);
		skillResponse.setTemplate(skillTemplate);
		System.out.println("skillResponse-------");
		System.out.println(skillResponse.toString());
		return skillResponse;
	}

	@ResponseBody
	@RequestMapping(value="/keyboard/test.do", method= RequestMethod.POST)
	public String testStr() {
		System.out.println("testStr");

		return "string은 답이 잘 오네요";
	}
	
	@RequestMapping(value="/keyboard/simpletextTest.do")
	public SimpleText simpletextTest() {
		SimpleText simple = new SimpleText();
		simple.setText("심플텍스트는 되나");
		
		return simple;
	}
}
