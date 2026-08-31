package p168W0;

import android.database.Cursor;
import p002A0.AbstractC0004b;
import p026D0.InterfaceC0180k;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.C7465t;

/* JADX INFO: renamed from: W0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1804f implements InterfaceC1803e {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5866a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5867b;

    /* JADX INFO: renamed from: W0.f$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1802d c1802d) {
            String str = c1802d.f5864a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            Long l7 = c1802d.f5865b;
            if (l7 == null) {
                interfaceC0180k.mo910m0(2);
            } else {
                interfaceC0180k.mo908R(2, l7.longValue());
            }
        }
    }

    public C1804f(AbstractC7462q abstractC7462q) {
        this.f5866a = abstractC7462q;
        this.f5867b = new a(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1803e
    /* JADX INFO: renamed from: a */
    public Long mo7517a(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5866a.m33028d();
        Long lValueOf = null;
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5866a, c7465tM33069n, false, null);
        try {
            if (cursorM5b.moveToFirst() && !cursorM5b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM5b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p168W0.InterfaceC1803e
    /* JADX INFO: renamed from: b */
    public void mo7518b(C1802d c1802d) {
        this.f5866a.m33028d();
        this.f5866a.m33029e();
        try {
            this.f5867b.m33016k(c1802d);
            this.f5866a.m33042z();
        } finally {
            this.f5866a.m33031i();
        }
    }
}
