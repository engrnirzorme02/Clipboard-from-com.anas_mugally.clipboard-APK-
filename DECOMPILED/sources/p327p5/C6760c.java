package p327p5;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: p5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6760c implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f27141a;

    public C6760c(InterfaceC1380a interfaceC1380a) {
        this.f27141a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C6760c m29549a(InterfaceC1380a interfaceC1380a) {
        return new C6760c(interfaceC1380a);
    }

    /* JADX INFO: renamed from: c */
    public static C6759b m29550c(Context context) {
        return new C6759b(context);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6759b get() {
        return m29550c((Context) this.f27141a.get());
    }
}
