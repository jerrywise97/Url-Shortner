package service;

import Data.models.Url;
import Dto.UrlRequestDto;
import org.springframework.stereotype.Service;


public interface UrlService {

      public Url generateShortLink(UrlRequestDto UrlRequestDto);
      public Url persistShortlink(Url url);
      public Url getEncoded(String url);
      public void deleteShortLink(Url url);
}
