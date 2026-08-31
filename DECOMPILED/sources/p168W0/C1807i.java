package p168W0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p002A0.AbstractC0003a;
import p002A0.AbstractC0004b;
import p026D0.InterfaceC0180k;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;
import p394y0.C7465t;

/* JADX INFO: renamed from: W0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1807i implements InterfaceC1806h {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5871a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5872b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7468w f5873c;

    /* JADX INFO: renamed from: W0.i$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1805g c1805g) {
            String str = c1805g.f5869a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            interfaceC0180k.mo908R(2, c1805g.f5870b);
        }
    }

    /* JADX INFO: renamed from: W0.i$b */
    class b extends AbstractC7468w {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C1807i(AbstractC7462q abstractC7462q) {
        this.f5871a = abstractC7462q;
        this.f5872b = new a(abstractC7462q);
        this.f5873c = new b(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1806h
    /* JADX INFO: renamed from: a */
    public List mo7520a() {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f5871a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5871a, c7465tM33069n, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(cursorM5b.getString(0));
            }
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            return arrayList;
        } catch (Throwable th) {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            throw th;
        }
    }

    @Override // p168W0.InterfaceC1806h
    /* JADX INFO: renamed from: b */
    public C1805g mo7521b(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5871a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5871a, c7465tM33069n, false, null);
        try {
            return cursorM5b.moveToFirst() ? new C1805g(cursorM5b.getString(AbstractC0003a.m3d(cursorM5b, "work_spec_id")), cursorM5b.getInt(AbstractC0003a.m3d(cursorM5b, "system_id"))) : null;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p168W0.InterfaceC1806h
    /* JADX INFO: renamed from: c */
    public void mo7522c(C1805g c1805g) {
        this.f5871a.m33028d();
        this.f5871a.m33029e();
        try {
            this.f5872b.m33016k(c1805g);
            this.f5871a.m33042z();
        } finally {
            this.f5871a.m33031i();
        }
    }

    @Override // p168W0.InterfaceC1806h
    /* JADX INFO: renamed from: d */
    public void mo7523d(String str) {
        this.f5871a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5873c.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        this.f5871a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5871a.m33042z();
        } finally {
            this.f5871a.m33031i();
            this.f5873c.m33085h(interfaceC0180kM33083b);
        }
    }
}
