package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a */
    public final ErrorCode f25974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC6118n.m27187e(errorCode, "errorCode");
        this.f25974a = errorCode;
    }
}
