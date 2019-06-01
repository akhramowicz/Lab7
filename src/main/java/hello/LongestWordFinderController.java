package hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LongestWordFinderController {
    @RequestMapping(value = "/findLongestWordIndex",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String find(@RequestBody final List<String> words){
        return words.get(findLongestWordIdx(words,1,0));
    }


    private int findLongestWordIdx(List<String> words,int currentIdx, int longestWordIdx) {
        return currentIdx == words.size() ?
                longestWordIdx : words.get(currentIdx).length() > words.get(longestWordIdx).length() ?
                findLongestWordIdx(words,++currentIdx,--currentIdx):findLongestWordIdx(words,++currentIdx,longestWordIdx);
    }
}