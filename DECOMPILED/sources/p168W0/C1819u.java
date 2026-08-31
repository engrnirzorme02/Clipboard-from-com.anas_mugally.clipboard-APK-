package p168W0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p002A0.AbstractC0004b;
import p026D0.InterfaceC0180k;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.C7465t;

/* JADX INFO: renamed from: W0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1819u implements InterfaceC1818t {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5933a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5934b;

    /* JADX INFO: renamed from: W0.u$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1817s c1817s) {
            String str = c1817s.f5931a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            String str2 = c1817s.f5932b;
            if (str2 == null) {
                interfaceC0180k.mo910m0(2);
            } else {
                interfaceC0180k.mo911t(2, str2);
            }
        }
    }

    public C1819u(AbstractC7462q abstractC7462q) {
        this.f5933a = abstractC7462q;
        this.f5934b = new a(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1818t
    /* JADX INFO: renamed from: a */
    public void mo7559a(C1817s c1817s) {
        this.f5933a.m33028d();
        this.f5933a.m33029e();
        try {
            this.f5934b.m33016k(c1817s);
            this.f5933a.m33042z();
        } finally {
            this.f5933a.m33031i();
        }
    }

    @Override // p168W0.InterfaceC1818t
    /* JADX INFO: renamed from: b */
    public List mo7560b(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5933a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5933a, c7465tM33069n, false, null);
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
}
