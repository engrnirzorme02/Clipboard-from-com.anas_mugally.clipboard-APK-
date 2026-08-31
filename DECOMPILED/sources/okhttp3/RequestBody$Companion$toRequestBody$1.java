package okhttp3;

import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ MediaType f25425b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0651h f25426c;

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo28463a() {
        return this.f25426c.m3090F();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType mo28464b() {
        return this.f25425b;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: e */
    public void mo28465e(InterfaceC0649f sink) {
        AbstractC6118n.m27187e(sink, "sink");
        sink.mo3017N0(this.f25426c);
    }
}
