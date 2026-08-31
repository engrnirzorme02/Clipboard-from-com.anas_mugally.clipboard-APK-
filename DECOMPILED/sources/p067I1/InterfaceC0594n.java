package p067I1;

import com.bumptech.glide.load.data.InterfaceC3219d;
import java.util.Collections;
import java.util.List;
import p019C1.C0132h;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: I1.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0594n {

    /* JADX INFO: renamed from: I1.n$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0130f f2274a;

        /* JADX INFO: renamed from: b */
        public final List f2275b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC3219d f2276c;

        public a(InterfaceC0130f interfaceC0130f, InterfaceC3219d interfaceC3219d) {
            this(interfaceC0130f, Collections.EMPTY_LIST, interfaceC3219d);
        }

        public a(InterfaceC0130f interfaceC0130f, List list, InterfaceC3219d interfaceC3219d) {
            this.f2274a = (InterfaceC0130f) AbstractC2022k.m8408e(interfaceC0130f);
            this.f2275b = (List) AbstractC2022k.m8408e(list);
            this.f2276c = (InterfaceC3219d) AbstractC2022k.m8408e(interfaceC3219d);
        }
    }

    /* JADX INFO: renamed from: a */
    a mo2552a(Object obj, int i7, int i8, C0132h c0132h);

    /* JADX INFO: renamed from: b */
    boolean mo2553b(Object obj);
}
