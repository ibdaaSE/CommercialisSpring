package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientFournisseurController {

	@Autowired
	private ClientFournisseurRepository clientFournisseurRepository;

	@RequestMapping(path = "/api/CFs")
	public @ResponseBody List getFiltredList(@RequestParam(value = "filter", defaultValue = "") String filter,
			@RequestParam(value = "filterAttribute", defaultValue = "") String filterAttribute,
			@RequestParam(value = "advancedFilter", defaultValue = "-1") String advancedFilter,
			@RequestParam(value = "pageIndex", defaultValue = "0") Integer pageIndex) {
		return clientFournisseurRepository.findAll(filter, filterAttribute, advancedFilter, 20, pageIndex);
	}

	@RequestMapping(path = "/api/CFs/count")
	public @ResponseBody Long countArticles(@RequestParam(value = "filter", defaultValue = "") String filter,
			@RequestParam(value = "filterAttribute", defaultValue = "") String filterAttribute,
			@RequestParam(value = "advancedFilter", defaultValue = "-1") String advancedFilter) {
		return clientFournisseurRepository.count(filter, filterAttribute, advancedFilter);
	}

}
