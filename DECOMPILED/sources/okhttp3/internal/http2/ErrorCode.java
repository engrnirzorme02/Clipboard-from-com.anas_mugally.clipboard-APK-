package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC6112h;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: b */
    public static final Companion f25776b = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final int f25790a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ErrorCode m29115a(int i7) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.m29114d() == i7) {
                    return errorCode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    ErrorCode(int i7) {
        this.f25790a = i7;
    }

    /* JADX INFO: renamed from: d */
    public final int m29114d() {
        return this.f25790a;
    }
}
