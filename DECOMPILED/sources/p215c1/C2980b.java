package p215c1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002A0.AbstractC0003a;
import p002A0.AbstractC0004b;
import p026D0.InterfaceC0180k;
import p225d1.C5209a;
import p394y0.AbstractC7453h;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;
import p394y0.C7465t;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2980b implements InterfaceC2979a {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f12305a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f12306b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7453h f12307c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7453h f12308d;

    /* JADX INFO: renamed from: e */
    private final AbstractC7468w f12309e;

    /* JADX INFO: renamed from: c1.b$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "INSERT OR ABORT INTO `category_table` (`categoryName`,`order`,`isLocked`,`pass`,`allowBiometric`,`name`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C5209a c5209a) {
            if (c5209a.m24098d() == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, c5209a.m24098d());
            }
            interfaceC0180k.mo908R(2, c5209a.m24100f());
            interfaceC0180k.mo908R(3, c5209a.m24102h() ? 1L : 0L);
            if (c5209a.m24101g() == null) {
                interfaceC0180k.mo910m0(4);
            } else {
                interfaceC0180k.mo911t(4, c5209a.m24101g());
            }
            interfaceC0180k.mo908R(5, c5209a.m24097c() ? 1L : 0L);
            if (c5209a.m24099e() == null) {
                interfaceC0180k.mo910m0(6);
            } else {
                interfaceC0180k.mo911t(6, c5209a.m24099e());
            }
        }
    }

    /* JADX INFO: renamed from: c1.b$b */
    class b extends AbstractC7453h {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "DELETE FROM `category_table` WHERE `categoryName` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7453h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo14849i(InterfaceC0180k interfaceC0180k, C5209a c5209a) {
            if (c5209a.m24098d() == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, c5209a.m24098d());
            }
        }
    }

    /* JADX INFO: renamed from: c1.b$c */
    class c extends AbstractC7453h {
        c(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "UPDATE OR ABORT `category_table` SET `categoryName` = ?,`order` = ?,`isLocked` = ?,`pass` = ?,`allowBiometric` = ?,`name` = ? WHERE `categoryName` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7453h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo14849i(InterfaceC0180k interfaceC0180k, C5209a c5209a) {
            if (c5209a.m24098d() == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, c5209a.m24098d());
            }
            interfaceC0180k.mo908R(2, c5209a.m24100f());
            interfaceC0180k.mo908R(3, c5209a.m24102h() ? 1L : 0L);
            if (c5209a.m24101g() == null) {
                interfaceC0180k.mo910m0(4);
            } else {
                interfaceC0180k.mo911t(4, c5209a.m24101g());
            }
            interfaceC0180k.mo908R(5, c5209a.m24097c() ? 1L : 0L);
            if (c5209a.m24099e() == null) {
                interfaceC0180k.mo910m0(6);
            } else {
                interfaceC0180k.mo911t(6, c5209a.m24099e());
            }
            if (c5209a.m24098d() == null) {
                interfaceC0180k.mo910m0(7);
            } else {
                interfaceC0180k.mo911t(7, c5209a.m24098d());
            }
        }
    }

    /* JADX INFO: renamed from: c1.b$d */
    class d extends AbstractC7468w {
        d(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM category_table";
        }
    }

    public C2980b(AbstractC7462q abstractC7462q) {
        this.f12305a = abstractC7462q;
        this.f12306b = new a(abstractC7462q);
        this.f12307c = new b(abstractC7462q);
        this.f12308d = new c(abstractC7462q);
        this.f12309e = new d(abstractC7462q);
    }

    /* JADX INFO: renamed from: g */
    public static List m14847g() {
        return Collections.EMPTY_LIST;
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: a */
    public void mo14841a(C5209a c5209a) {
        this.f12305a.m33028d();
        this.f12305a.m33029e();
        try {
            this.f12308d.m33013j(c5209a);
            this.f12305a.m33042z();
        } finally {
            this.f12305a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: b */
    public void mo14842b(C5209a c5209a) {
        this.f12305a.m33028d();
        this.f12305a.m33029e();
        try {
            this.f12306b.m33016k(c5209a);
            this.f12305a.m33042z();
        } finally {
            this.f12305a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: c */
    public void mo14843c(C5209a c5209a) {
        this.f12305a.m33028d();
        this.f12305a.m33029e();
        try {
            this.f12307c.m33013j(c5209a);
            this.f12305a.m33042z();
        } finally {
            this.f12305a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: d */
    public void mo14844d(List list) {
        this.f12305a.m33028d();
        this.f12305a.m33029e();
        try {
            this.f12308d.m33014k(list);
            this.f12305a.m33042z();
        } finally {
            this.f12305a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: e */
    public List mo14845e() {
        C7465t c7465tM33069n = C7465t.m33069n("select * from category_table order by `order` ", 0);
        this.f12305a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12305a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "categoryName");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "order");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "isLocked");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "pass");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "allowBiometric");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "name");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5209a(cursorM5b.isNull(iM3d) ? null : cursorM5b.getString(iM3d), cursorM5b.getInt(iM3d2), cursorM5b.getInt(iM3d3) != 0, cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.getInt(iM3d5) != 0, cursorM5b.isNull(iM3d6) ? null : cursorM5b.getString(iM3d6)));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2979a
    /* JADX INFO: renamed from: f */
    public List mo14846f() {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM category_table WHERE isLocked = 0 ORDER BY `order`", 0);
        this.f12305a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12305a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "categoryName");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "order");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "isLocked");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "pass");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "allowBiometric");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "name");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5209a(cursorM5b.isNull(iM3d) ? null : cursorM5b.getString(iM3d), cursorM5b.getInt(iM3d2), cursorM5b.getInt(iM3d3) != 0, cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.getInt(iM3d5) != 0, cursorM5b.isNull(iM3d6) ? null : cursorM5b.getString(iM3d6)));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }
}
