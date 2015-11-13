package totec.spring_boot.simple.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akano_yuki on 2015/11/13.
 */
@RequestMapping("/post")
@RestController
public class PostItemController {

	@RequestMapping(value = "/{postId}")
	public static String userInfo(@PathVariable String postId, Model model) {
		System.out.println("---------------" + postId);
		model.addAttribute("postId", postId);
		model.addAttribute("itemSupplier", "アップル");
		model.addAttribute("itemSoldQuantity", 10);
		model.addAttribute("itemSalePrice", 1000000000);
		model.addAttribute("postUserId", "akano");
		model.addAttribute("userImage", "usfd2e1839d62dd2a9bb437b16588de0deab78057f.png");
		model.addAttribute("postDatetime", 1044258479);
		model.addAttribute("postItemScore", 87);
		model.addAttribute("postItemState", "返品済み");

		return "/review";
	}
}
