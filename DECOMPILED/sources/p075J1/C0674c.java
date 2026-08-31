package p075J1;

import android.content.Context;
import android.net.Uri;
import p019C1.C0132h;
import p027D1.AbstractC0183c;
import p027D1.C0184d;
import p067I1.C0598r;
import p067I1.InterfaceC0594n;
import p067I1.InterfaceC0595o;
import p091L1.C0809b0;
import p176X1.C1944d;

/* JADX INFO: renamed from: J1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0674c implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2617a;

    /* JADX INFO: renamed from: J1.c$a */
    public static class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2618a;

        public a(Context context) {
            this.f2618a = context;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0674c(this.f2618a);
        }
    }

    public C0674c(Context context) {
        this.f2617a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: e */
    private boolean m3188e(C0132h c0132h) {
        Long l7 = (Long) c0132h.m600c(C0809b0.f3236d);
        return l7 != null && l7.longValue() == -1;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        if (AbstractC0183c.m923f(i7, i8) && m3188e(c0132h)) {
            return new InterfaceC0594n.a(new C1944d(uri), C0184d.m928g(this.f2617a, uri));
        }
        return null;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return AbstractC0183c.m922e(uri);
    }
}
