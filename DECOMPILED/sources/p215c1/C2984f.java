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
import p225d1.C5211c;
import p394y0.AbstractC7453h;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;
import p394y0.C7465t;

/* JADX INFO: renamed from: c1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2984f implements InterfaceC2983e {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f12323a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f12324b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7453h f12325c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7453h f12326d;

    /* JADX INFO: renamed from: e */
    private final AbstractC7468w f12327e;

    /* JADX INFO: renamed from: f */
    private final AbstractC7468w f12328f;

    /* JADX INFO: renamed from: c1.f$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "INSERT OR ABORT INTO `text_table` (`id`,`time`,`textTitle`,`textContent`,`category`,`orderPin`,`isUploaded`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C5211c c5211c) {
            interfaceC0180k.mo908R(1, c5211c.m24110d());
            interfaceC0180k.mo908R(2, c5211c.m24114h());
            if (c5211c.m24113g() == null) {
                interfaceC0180k.mo910m0(3);
            } else {
                interfaceC0180k.mo911t(3, c5211c.m24113g());
            }
            if (c5211c.m24112f() == null) {
                interfaceC0180k.mo910m0(4);
            } else {
                interfaceC0180k.mo911t(4, c5211c.m24112f());
            }
            if (c5211c.m24109c() == null) {
                interfaceC0180k.mo910m0(5);
            } else {
                interfaceC0180k.mo911t(5, c5211c.m24109c());
            }
            interfaceC0180k.mo908R(6, c5211c.m24111e());
            interfaceC0180k.mo908R(7, c5211c.m24115i() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: c1.f$b */
    class b extends AbstractC7453h {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "DELETE FROM `text_table` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7453h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo14849i(InterfaceC0180k interfaceC0180k, C5211c c5211c) {
            interfaceC0180k.mo908R(1, c5211c.m24110d());
        }
    }

    /* JADX INFO: renamed from: c1.f$c */
    class c extends AbstractC7453h {
        c(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        protected String mo7514e() {
            return "UPDATE OR ABORT `text_table` SET `id` = ?,`time` = ?,`textTitle` = ?,`textContent` = ?,`category` = ?,`orderPin` = ?,`isUploaded` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.AbstractC7453h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo14849i(InterfaceC0180k interfaceC0180k, C5211c c5211c) {
            interfaceC0180k.mo908R(1, c5211c.m24110d());
            interfaceC0180k.mo908R(2, c5211c.m24114h());
            if (c5211c.m24113g() == null) {
                interfaceC0180k.mo910m0(3);
            } else {
                interfaceC0180k.mo911t(3, c5211c.m24113g());
            }
            if (c5211c.m24112f() == null) {
                interfaceC0180k.mo910m0(4);
            } else {
                interfaceC0180k.mo911t(4, c5211c.m24112f());
            }
            if (c5211c.m24109c() == null) {
                interfaceC0180k.mo910m0(5);
            } else {
                interfaceC0180k.mo911t(5, c5211c.m24109c());
            }
            interfaceC0180k.mo908R(6, c5211c.m24111e());
            interfaceC0180k.mo908R(7, c5211c.m24115i() ? 1L : 0L);
            interfaceC0180k.mo908R(8, c5211c.m24110d());
        }
    }

    /* JADX INFO: renamed from: c1.f$d */
    class d extends AbstractC7468w {
        d(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM text_table";
        }
    }

    /* JADX INFO: renamed from: c1.f$e */
    class e extends AbstractC7468w {
        e(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM text_table WHERE category=? ";
        }
    }

    public C2984f(AbstractC7462q abstractC7462q) {
        this.f12323a = abstractC7462q;
        this.f12324b = new a(abstractC7462q);
        this.f12325c = new b(abstractC7462q);
        this.f12326d = new c(abstractC7462q);
        this.f12327e = new d(abstractC7462q);
        this.f12328f = new e(abstractC7462q);
    }

    /* JADX INFO: renamed from: z */
    public static List m14885z() {
        return Collections.EMPTY_LIST;
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: a */
    public void mo14860a(List list) {
        this.f12323a.m33028d();
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("DELETE FROM text_table WHERE id IN (");
        AbstractC0006d.m8a(sbM9b, list.size());
        sbM9b.append(")");
        InterfaceC0180k interfaceC0180kM33030f = this.f12323a.m33030f(sbM9b.toString());
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
        this.f12323a.m33029e();
        try {
            interfaceC0180kM33030f.mo913y();
            this.f12323a.m33042z();
        } finally {
            this.f12323a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: b */
    public void mo14861b(C5211c c5211c) {
        this.f12323a.m33028d();
        this.f12323a.m33029e();
        try {
            this.f12325c.m33013j(c5211c);
            this.f12323a.m33042z();
        } finally {
            this.f12323a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: c */
    public List mo14862c(String str, List list) {
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("SELECT * FROM text_table ");
        sbM9b.append("\n");
        sbM9b.append("    WHERE (textContent LIKE ");
        sbM9b.append("?");
        sbM9b.append(" OR textTitle LIKE ");
        sbM9b.append("?");
        sbM9b.append(")");
        sbM9b.append("\n");
        sbM9b.append("    AND category NOT IN (");
        int size = list.size();
        AbstractC0006d.m8a(sbM9b, size);
        sbM9b.append(")");
        sbM9b.append("\n");
        sbM9b.append("    ORDER BY time DESC");
        C7465t c7465tM33069n = C7465t.m33069n(sbM9b.toString(), size + 2);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        Iterator it = list.iterator();
        int i7 = 3;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                c7465tM33069n.mo910m0(i7);
            } else {
                c7465tM33069n.mo911t(i7, str2);
            }
            i7++;
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: d */
    public List mo14863d(String str, long j7, long j8) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE category = ?\n    AND time >= ? AND time <= ?\n    ORDER BY time DESC", 3);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        c7465tM33069n.mo908R(2, j7);
        c7465tM33069n.mo908R(3, j8);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: e */
    public List mo14864e(long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 1);
        c7465tM33069n.mo908R(1, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: f */
    public List mo14865f(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("select * from text_table where category =? order  by orderPin DESC ,time DESC", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: g */
    public List mo14866g() {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table", 0);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: h */
    public List mo14867h(String str, String str2, long j7, long j8) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE category = ?\n    AND (textContent LIKE ? OR textTitle LIKE ?)\n    AND time >= ? AND time <= ?\n    ORDER BY time DESC", 5);
        if (str2 == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str2);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(3);
        } else {
            c7465tM33069n.mo911t(3, str);
        }
        c7465tM33069n.mo908R(4, j7);
        c7465tM33069n.mo908R(5, j8);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: i */
    public List mo14868i(int i7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC\n    LIMIT ?", 1);
        c7465tM33069n.mo908R(1, i7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: j */
    public List mo14869j(String str, long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE (textContent LIKE ? OR textTitle LIKE ?)\n    AND time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 3);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        c7465tM33069n.mo908R(3, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: k */
    public void mo14870k(String str) {
        this.f12323a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f12328f.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        try {
            this.f12323a.m33029e();
            try {
                interfaceC0180kM33083b.mo913y();
                this.f12323a.m33042z();
                this.f12323a.m33031i();
                this.f12328f.m33085h(interfaceC0180kM33083b);
            } catch (Throwable th) {
                this.f12323a.m33031i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f12328f.m33085h(interfaceC0180kM33083b);
            throw th2;
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: l */
    public List mo14871l(List list) {
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("SELECT textContent FROM text_table WHERE id IN (");
        int size = list.size();
        AbstractC0006d.m8a(sbM9b, size);
        sbM9b.append(") ORDER by orderPin DESC ,time DESC");
        C7465t c7465tM33069n = C7465t.m33069n(sbM9b.toString(), size);
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                c7465tM33069n.mo910m0(i7);
            } else {
                c7465tM33069n.mo908R(i7, num.intValue());
            }
            i7++;
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(cursorM5b.isNull(0) ? null : cursorM5b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: m */
    public List mo14872m(String str, long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE (textContent LIKE ? OR textTitle LIKE ?)\n    AND time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 3);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        c7465tM33069n.mo908R(3, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: n */
    public void mo14873n(C5211c c5211c) {
        this.f12323a.m33028d();
        this.f12323a.m33029e();
        try {
            this.f12326d.m33013j(c5211c);
            this.f12323a.m33042z();
        } finally {
            this.f12323a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: o */
    public List mo14874o(String str, long j7, long j8) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE (textContent LIKE ? OR textTitle LIKE ?)\n    AND time >= ? AND time <= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 4);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        c7465tM33069n.mo908R(3, j7);
        c7465tM33069n.mo908R(4, j8);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: p */
    public List mo14875p(long j7, long j8, List list) {
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("SELECT * FROM text_table ");
        sbM9b.append("\n");
        sbM9b.append("    WHERE time >= ");
        sbM9b.append("?");
        sbM9b.append(" AND time <= ");
        sbM9b.append("?");
        sbM9b.append("\n");
        sbM9b.append("    AND category NOT IN (");
        int size = list.size();
        AbstractC0006d.m8a(sbM9b, size);
        sbM9b.append(")");
        sbM9b.append("\n");
        sbM9b.append("    ORDER BY time DESC");
        C7465t c7465tM33069n = C7465t.m33069n(sbM9b.toString(), size + 2);
        c7465tM33069n.mo908R(1, j7);
        c7465tM33069n.mo908R(2, j8);
        Iterator it = list.iterator();
        int i7 = 3;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                c7465tM33069n.mo910m0(i7);
            } else {
                c7465tM33069n.mo911t(i7, str);
            }
            i7++;
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: q */
    public List mo14876q(long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 1);
        c7465tM33069n.mo908R(1, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: r */
    public List mo14877r(String str, long j7, long j8, List list) {
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("SELECT * FROM text_table ");
        sbM9b.append("\n");
        sbM9b.append("    WHERE (textContent LIKE ");
        sbM9b.append("?");
        sbM9b.append(" OR textTitle LIKE ");
        sbM9b.append("?");
        sbM9b.append(")");
        sbM9b.append("\n");
        sbM9b.append("    AND time >= ");
        sbM9b.append("?");
        sbM9b.append(" AND time <= ");
        sbM9b.append("?");
        sbM9b.append("\n");
        sbM9b.append("    AND category NOT IN (");
        int size = list.size();
        AbstractC0006d.m8a(sbM9b, size);
        sbM9b.append(")");
        sbM9b.append("\n");
        sbM9b.append("    ORDER BY time DESC");
        C7465t c7465tM33069n = C7465t.m33069n(sbM9b.toString(), size + 4);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        c7465tM33069n.mo908R(3, j7);
        c7465tM33069n.mo908R(4, j8);
        Iterator it = list.iterator();
        int i7 = 5;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                c7465tM33069n.mo910m0(i7);
            } else {
                c7465tM33069n.mo911t(i7, str2);
            }
            i7++;
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: s */
    public void mo14878s(C5211c c5211c) {
        this.f12323a.m33028d();
        this.f12323a.m33029e();
        try {
            this.f12324b.m33016k(c5211c);
            this.f12323a.m33042z();
        } finally {
            this.f12323a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: t */
    public List mo14879t(long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 1);
        c7465tM33069n.mo908R(1, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: u */
    public List mo14880u(long j7, long j8) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE time >= ? AND time <= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 2);
        c7465tM33069n.mo908R(1, j7);
        c7465tM33069n.mo908R(2, j8);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: v */
    public List mo14881v(String str, String str2) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE category = ?\n    AND (textContent LIKE ? OR textTitle LIKE ?)\n    ORDER BY time DESC", 3);
        if (str2 == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str2);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(3);
        } else {
            c7465tM33069n.mo911t(3, str);
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: w */
    public long mo14882w(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT MAX(orderPin) FROM text_table WHERE category =?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            return cursorM5b.moveToFirst() ? cursorM5b.getLong(0) : 0L;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: x */
    public void mo14883x(List list) {
        this.f12323a.m33028d();
        this.f12323a.m33029e();
        try {
            this.f12324b.m33015j(list);
            this.f12323a.m33042z();
        } finally {
            this.f12323a.m33031i();
        }
    }

    @Override // p215c1.InterfaceC2983e
    /* JADX INFO: renamed from: y */
    public List mo14884y(String str, long j7) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT * FROM text_table \n    WHERE (textContent LIKE ? OR textTitle LIKE ?)\n    AND time >= ?\n    AND category NOT IN (SELECT categoryName FROM category_table WHERE isLocked = 1)\n    ORDER BY time DESC", 3);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        if (str == null) {
            c7465tM33069n.mo910m0(2);
        } else {
            c7465tM33069n.mo911t(2, str);
        }
        c7465tM33069n.mo908R(3, j7);
        this.f12323a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f12323a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "time");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "textTitle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "textContent");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "category");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "orderPin");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "isUploaded");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(new C5211c(cursorM5b.getInt(iM3d), cursorM5b.getLong(iM3d2), cursorM5b.isNull(iM3d3) ? null : cursorM5b.getString(iM3d3), cursorM5b.isNull(iM3d4) ? null : cursorM5b.getString(iM3d4), cursorM5b.isNull(iM3d5) ? null : cursorM5b.getString(iM3d5), cursorM5b.getLong(iM3d6), cursorM5b.getInt(iM3d7) != 0));
            }
            return arrayList;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }
}
