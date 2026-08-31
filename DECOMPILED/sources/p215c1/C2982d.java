package p215c1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p002A0.AbstractC0003a;
import p002A0.AbstractC0004b;
import p002A0.AbstractC0006d;
import p026D0.InterfaceC0180k;
import p225d1.C5210b;
import p394y0.AbstractC7453h;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;
import p394y0.C7465t;

/* JADX INFO: renamed from: c1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2982d implements InterfaceC2981c {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f12314a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f12315b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7453h f12316c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7468w f12317d;

    /* JADX INFO: renamed from: e */
    private final AbstractC7468w f12318e;

    /* JADX INFO: renamed from: c1.d$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "INSERT OR ABORT INTO `temporary_text_table` (`id`,`time`,`text`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C5210b c5210b) {
            interfaceC0180k.mo908R(1, c5210b.m24104a());
            interfaceC0180k.mo908R(2, c5210b.m24106c());
            if (c5210b.m24105b() == null) {
                interfaceC0180k.mo910m0(3);
            } else {
                interfaceC0180k.mo911t(3, c5210b.m24105b());
            }
        }
    }

    /* JADX INFO: renamed from: c1.d$b */
    class b extends AbstractC7453h {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "DELETE FROM `temporary_text_table` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7453h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo14849i(InterfaceC0180k interfaceC0180k, C5210b c5210b) {
            interfaceC0180k.mo908R(1, c5210b.m24104a());
        }
    }

    /* JADX INFO: renamed from: c1.d$c */
    class c extends AbstractC7468w {
        c(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM temporary_text_table";
        }
    }

    /* JADX INFO: renamed from: c1.d$d */
    class d extends AbstractC7468w {
        d(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM temporary_text_table WHERE ? - time > ?";
        }
    }

    public C2982d(AbstractC7462q abstractC7462q) {
        this.f12314a = abstractC7462q;
        this.f12315b = new a(abstractC7462q);
        this.f12316c = new b(abstractC7462q);
        this.f12317d = new c(abstractC7462q);
        this.f12318e = new d(abstractC7462q);
    }

    /* JADX INFO: renamed from: f */
    public static List m14857f() {
        return Collections.EMPTY_LIST;
    }

    @Override // p215c1.InterfaceC2981c
    /* JADX INFO: renamed from: a */
    public void mo14852a(List list) {
        this.f12314a.m33028d();
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("DELETE FROM temporary_text_table WHERE id IN (");
        AbstractC0006d.m8a(sbM9b, list.size());
        sbM9b.append(")");
        InterfaceC0180k interfaceC0180kM33030f = this.f12314a.m33030f(sbM9b.toString());
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                interfaceC0180kM33030f.mo910m0(i7);
            } else {
                interfaceC0180kM33030f.mo908R(i7, num.intValue());
            }
            i7++;
        }
        this.f12314a.m33029e();
        try {
            interfaceC0180kM33030f.mo913y();
            this.f12314a.m33042z();
        } finally {
            this.f12314a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2981c
    /* JADX INFO: renamed from: b */
    public void mo14853b() {
        this.f12314a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f12317d.m33083b();
        try {
            this.f12314a.m33029e();
            try {
                interfaceC0180kM33083b.mo913y();
                this.f12314a.m33042z();
                this.f12314a.m33031i();
                this.f12317d.m33085h(interfaceC0180kM33083b);
            } catch (Throwable th) {
                this.f12314a.m33031i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f12317d.m33085h(interfaceC0180kM33083b);
            throw th2;
        }
    }

    @Override // p215c1.InterfaceC2981c
    /* JADX INFO: renamed from: c */
    public void mo14854c(long j7, long j8) {
        this.f12314a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f12318e.m33083b();
        interfaceC0180kM33083b.mo908R(1, j7);
        interfaceC0180kM33083b.mo908R(2, j8);
        try {
            this.f12314a.m33029e();
            try {
                interfaceC0180kM33083b.mo913y();
                this.f12314a.m33042z();
                this.f12314a.m33031i();
                this.f12318e.m33085h(interfaceC0180kM33083b);
            } catch (Throwable th) {
                this.f12314a.m33031i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f12318e.m33085h(interfaceC0180kM33083b);
            throw th2;
        }
    }

    @Override // p215c1.InterfaceC2981c
    /* JADX INFO: renamed from: d */
    public List mo14855d(Integer num, String str, int i7) {
        C7465t c7465tM33069n = C7465t.m33069n("\n    SELECT * FROM temporary_text_table\n    WHERE (? = -1 OR id < ?)\n      AND (? IS NULL OR text LIKE '%' || ? || '%')\n    ORDER BY id DESC\n    LIMIT ?\n", 5);
        if (num == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo908R(1, num.intValue());
        }
        if (num == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo908R(2, num.intValue());
        }
        if (str == null) {
            c7465tM33069n.mo910m0(3);
        } else {
            c7465tM33069n.mo911t(3, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(4);
        } else {
            c7465tM33069n.mo911t(4, str);
        }
        c7465tM33069n.mo908R(5, i7);
        this.f12314a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12314a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "text");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5210b(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3)));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2981c
    /* JADX INFO: renamed from: e */
    public void mo14856e(C5210b c5210b) {
        this.f12314a.m33028d();
        this.f12314a.m33029e();
        try {
            this.f12315b.m33016k(c5210b);
            this.f12314a.m33042z();
        } finally {
            this.f12314a.m33031i();
        }
    }
}
