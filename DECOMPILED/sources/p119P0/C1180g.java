package p119P0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p112O0.AbstractC1097j;
import p112O0.AbstractC1105r;
import p112O0.AbstractC1108u;
import p112O0.EnumC1091d;
import p112O0.InterfaceC1100m;
import p175X0.RunnableC1924b;

/* JADX INFO: renamed from: P0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1180g extends AbstractC1105r {

    /* JADX INFO: renamed from: j */
    private static final String f4159j = AbstractC1097j.m4846f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    private final C1182i f4160a;

    /* JADX INFO: renamed from: b */
    private final String f4161b;

    /* JADX INFO: renamed from: c */
    private final EnumC1091d f4162c;

    /* JADX INFO: renamed from: d */
    private final List f4163d;

    /* JADX INFO: renamed from: e */
    private final List f4164e;

    /* JADX INFO: renamed from: f */
    private final List f4165f;

    /* JADX INFO: renamed from: g */
    private final List f4166g;

    /* JADX INFO: renamed from: h */
    private boolean f4167h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1100m f4168i;

    public C1180g(C1182i c1182i, List list) {
        this(c1182i, null, EnumC1091d.KEEP, list, null);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m5144i(C1180g c1180g, Set set) {
        set.addAll(c1180g.m5148c());
        Set setM5145l = m5145l(c1180g);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setM5145l.contains((String) it.next())) {
                return true;
            }
        }
        List listM5150e = c1180g.m5150e();
        if (listM5150e != null && !listM5150e.isEmpty()) {
            Iterator it2 = listM5150e.iterator();
            while (it2.hasNext()) {
                if (m5144i((C1180g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c1180g.m5148c());
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static Set m5145l(C1180g c1180g) {
        HashSet hashSet = new HashSet();
        List listM5150e = c1180g.m5150e();
        if (listM5150e != null && !listM5150e.isEmpty()) {
            Iterator it = listM5150e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C1180g) it.next()).m5148c());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1100m m5146a() {
        if (this.f4167h) {
            AbstractC1097j.m4844c().mo4851h(f4159j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f4164e)), new Throwable[0]);
        } else {
            RunnableC1924b runnableC1924b = new RunnableC1924b(this);
            this.f4160a.m5174p().mo8371b(runnableC1924b);
            this.f4168i = runnableC1924b.m7967d();
        }
        return this.f4168i;
    }

    /* JADX INFO: renamed from: b */
    public EnumC1091d m5147b() {
        return this.f4162c;
    }

    /* JADX INFO: renamed from: c */
    public List m5148c() {
        return this.f4164e;
    }

    /* JADX INFO: renamed from: d */
    public String m5149d() {
        return this.f4161b;
    }

    /* JADX INFO: renamed from: e */
    public List m5150e() {
        return this.f4166g;
    }

    /* JADX INFO: renamed from: f */
    public List m5151f() {
        return this.f4163d;
    }

    /* JADX INFO: renamed from: g */
    public C1182i m5152g() {
        return this.f4160a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5153h() {
        return m5144i(this, new HashSet());
    }

    /* JADX INFO: renamed from: j */
    public boolean m5154j() {
        return this.f4167h;
    }

    /* JADX INFO: renamed from: k */
    public void m5155k() {
        this.f4167h = true;
    }

    public C1180g(C1182i c1182i, String str, EnumC1091d enumC1091d, List list, List list2) {
        this.f4160a = c1182i;
        this.f4161b = str;
        this.f4162c = enumC1091d;
        this.f4163d = list;
        this.f4166g = list2;
        this.f4164e = new ArrayList(list.size());
        this.f4165f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f4165f.addAll(((C1180g) it.next()).f4165f);
            }
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            String strM4867a = ((AbstractC1108u) list.get(i7)).m4867a();
            this.f4164e.add(strM4867a);
            this.f4165f.add(strM4867a);
        }
    }
}
