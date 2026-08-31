package okhttp3.internal.http;

import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p072I6.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: b */
    private final String f25736b;

    /* JADX INFO: renamed from: c */
    private final long f25737c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0650g f25738d;

    public RealResponseBody(String str, long j7, InterfaceC0650g source) {
        AbstractC6118n.m27187e(source, "source");
        this.f25736b = str;
        this.f25737c = j7;
        this.f25738d = source;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: m */
    public long mo28325m() {
        return this.f25737c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: n */
    public MediaType mo28326n() {
        String str = this.f25736b;
        if (str != null) {
            return MediaType.f25301e.m28566b(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: x */
    public InterfaceC0650g mo28327x() {
        return this.f25738d;
    }
}
