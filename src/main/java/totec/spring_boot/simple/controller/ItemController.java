package totec.spring_boot.simple.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
@RequestMapping("/item")
@RestController
public class ItemController {

	@RequestMapping(value = "/{itemId}")
	public static String userInfo(@PathVariable String itemId, Model model) {
		System.out.println("---------------" + itemId);
		model.addAttribute("itemId", itemId);
		model.addAttribute("itemImage", "it907d4928c120851f9bee80daa876a5b866d98d8b.png");
		model.addAttribute("itemSupplier", "アップル");
		model.addAttribute("itemSoldQuantity", 10);
		model.addAttribute("itemSalePrice", 1000000000);
		String itemTags = "精密部品,サービス,ケース付き,ビン単位";
		List<String> tagList = Arrays.asList(itemTags.split(","));
		model.addAttribute("itemTags", tagList);

		return "/item";
	}
}
