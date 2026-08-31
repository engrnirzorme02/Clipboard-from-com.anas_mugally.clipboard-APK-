package okhttp3;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.AbstractC0659p;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p220c6.AbstractC3026b;

/* JADX INFO: loaded from: classes.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ MediaType f25423b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ File f25424c;

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo28463a() {
        return this.f25424c.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType mo28464b() {
        return this.f25423b;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: e */
    public void mo28465e(InterfaceC0649f sink) throws IOException {
        AbstractC6118n.m27187e(sink, "sink");
        InterfaceC0640B interfaceC0640BM3138j = AbstractC0659p.m3138j(this.f25424c);
        try {
            sink.mo3029W(interfaceC0640BM3138j);
            AbstractC3026b.m14999a(interfaceC0640BM3138j, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(interfaceC0640BM3138j, th);
                throw th2;
            }
        }
    }
}
