package p168W0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p002A0.AbstractC0004b;
import p026D0.InterfaceC0180k;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.C7465t;

/* JADX INFO: renamed from: W0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1801c implements InterfaceC1800b {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5861a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5862b;

    /* JADX INFO: renamed from: W0.c$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1799a c1799a) {
            String str = c1799a.f5859a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            String str2 = c1799a.f5860b;
            if (str2 == null) {
                interfaceC0180k.mo910m0(2);
            } else {
                interfaceC0180k.mo911t(2, str2);
            }
        }
    }

    public C1801c(AbstractC7462q abstractC7462q) {
        this.f5861a = abstractC7462q;
        this.f5862b = new a(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1800b
    /* JADX INFO: renamed from: a */
    public List mo7510a(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5861a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5861a, c7465tM33069n, false, null);
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

    @Override // p168W0.InterfaceC1800b
    /* JADX INFO: renamed from: b */
    public void mo7511b(C1799a c1799a) {
        this.f5861a.m33028d();
        this.f5861a.m33029e();
        try {
            this.f5862b.m33016k(c1799a);
            this.f5861a.m33042z();
        } finally {
            this.f5861a.m33031i();
        }
    }

    @Override // p168W0.InterfaceC1800b
    /* JADX INFO: renamed from: c */
    public boolean mo7512c(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5861a.m33028d();
        boolean z7 = false;
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5861a, c7465tM33069n, false, null);
        try {
            if (cursorM5b.moveToFirst()) {
                z7 = cursorM5b.getInt(0) != 0;
            }
            return z7;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p168W0.InterfaceC1800b
    /* JADX INFO: renamed from: d */
    public boolean mo7513d(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5861a.m33028d();
        boolean z7 = false;
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5861a, c7465tM33069n, false, null);
        try {
            if (cursorM5b.moveToFirst()) {
                z7 = cursorM5b.getInt(0) != 0;
            }
            return z7;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }
}
