package p095L5;

/* JADX INFO: renamed from: L5.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0845a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);


    /* JADX INFO: renamed from: a */
    public final int f3344a;

    /* JADX INFO: renamed from: b */
    public final int f3345b;

    /* JADX INFO: renamed from: c */
    public final int f3346c;

    EnumC0845a(int i7, int i8, int i9) {
        this.f3344a = i7;
        this.f3345b = i8;
        this.f3346c = i9;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC0845a m3888c(int i7) {
        for (EnumC0845a enumC0845a : values()) {
            if (enumC0845a.f3344a == i7) {
                return enumC0845a;
            }
        }
        return null;
    }
}
