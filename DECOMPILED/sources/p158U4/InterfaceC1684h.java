package p158U4;

import java.util.Comparator;
import p351s5.C7039u;

/* JADX INFO: renamed from: U4.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1684h {

    /* JADX INFO: renamed from: a */
    public static final Comparator f5600a = new Comparator() { // from class: U4.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((InterfaceC1684h) obj).getKey().compareTo(((InterfaceC1684h) obj2).getKey());
        }
    };

    /* JADX INFO: renamed from: a */
    C1694r mo7072a();

    /* JADX INFO: renamed from: b */
    boolean mo7073b();

    /* JADX INFO: renamed from: c */
    boolean mo7074c();

    /* JADX INFO: renamed from: d */
    boolean mo7075d();

    /* JADX INFO: renamed from: e */
    boolean mo7076e();

    /* JADX INFO: renamed from: f */
    C1698v mo7077f();

    /* JADX INFO: renamed from: g */
    C7039u mo7078g(C1693q c1693q);

    C1695s getData();

    C1687k getKey();

    /* JADX INFO: renamed from: h */
    boolean mo7079h();

    /* JADX INFO: renamed from: i */
    boolean mo7080i();

    /* JADX INFO: renamed from: j */
    C1698v mo7081j();
}
