package p192Z3;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.C4828L;
import com.google.firebase.auth.C4831O;
import com.google.firebase.auth.C4858i;
import com.google.firebase.auth.C4861j0;
import com.google.firebase.auth.C4883x;
import com.google.firebase.auth.C4884y;

/* JADX INFO: renamed from: Z3.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2110Y {
    /* JADX INFO: renamed from: a */
    public static zzajb m8674a(AbstractC4854g abstractC4854g, String str) {
        AbstractC3718s.m18083l(abstractC4854g);
        if (abstractC4854g instanceof C4884y) {
            return C4884y.m22062W((C4884y) abstractC4854g, str);
        }
        if (abstractC4854g instanceof C4858i) {
            return C4858i.m22039W((C4858i) abstractC4854g, str);
        }
        if (abstractC4854g instanceof C4831O) {
            return C4831O.m22016W((C4831O) abstractC4854g, str);
        }
        if (abstractC4854g instanceof C4883x) {
            return C4883x.m22061W((C4883x) abstractC4854g, str);
        }
        if (abstractC4854g instanceof C4828L) {
            return C4828L.m22014W((C4828L) abstractC4854g, str);
        }
        if (abstractC4854g instanceof C4861j0) {
            return C4861j0.m22051Z((C4861j0) abstractC4854g, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
