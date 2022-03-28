package service;

import Data.models.Url;
import Dto.UrlRequestDto;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl implements UrlService{
    @Override
    public Url generateShortLink(UrlRequestDto UrlRequestDto) {
        return null;
    }

    @Override
    public Url persistShortlink(Url url) {
        return null;

    }

    @Override
    public Url getEncoded(String url) {
        return null;
    }

    @Override
    public void deleteShortLink(Url url) {

    }
}
