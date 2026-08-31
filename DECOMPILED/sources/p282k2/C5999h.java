package p282k2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p234e2.AbstractC5338d;
import p234e2.InterfaceC5336b;

/* JADX INFO: renamed from: k2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5999h implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f23768a;

    public C5999h(InterfaceC1380a interfaceC1380a) {
        this.f23768a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C5999h m27030a(InterfaceC1380a interfaceC1380a) {
        return new C5999h(interfaceC1380a);
    }

    /* JADX INFO: renamed from: c */
    public static String m27031c(Context context) {
        return (String) AbstractC5338d.m24331d(AbstractC5997f.m27023b(context));
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m27031c((Context) this.f23768a.get());
    }
}
