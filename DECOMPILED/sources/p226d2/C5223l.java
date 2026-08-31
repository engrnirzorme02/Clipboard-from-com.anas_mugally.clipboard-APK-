package p226d2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;

/* JADX INFO: renamed from: d2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5223l implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f19945a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f19946b;

    public C5223l(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f19945a = interfaceC1380a;
        this.f19946b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C5223l m24143a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C5223l(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static C5222k m24144c(Context context, Object obj) {
        return new C5222k(context, (C5220i) obj);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5222k get() {
        return m24144c((Context) this.f19945a.get(), this.f19946b.get());
    }
}
