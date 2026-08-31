package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaas;
import com.google.firebase.auth.AbstractC4817C;
import com.google.firebase.auth.AbstractC4818D;
import com.google.firebase.auth.AbstractC4819E;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import com.google.firebase.auth.C4861j0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2134l extends AbstractC4818D {
    public static final Parcelable.Creator<C2134l> CREATOR = new C2136n();

    /* JADX INFO: renamed from: a */
    private final List f6970a;

    /* JADX INFO: renamed from: b */
    private final C2135m f6971b;

    /* JADX INFO: renamed from: c */
    private final String f6972c;

    /* JADX INFO: renamed from: d */
    private final C4861j0 f6973d;

    /* JADX INFO: renamed from: e */
    private final C2126h f6974e;

    /* JADX INFO: renamed from: f */
    private final List f6975f;

    public C2134l(List list, C2135m c2135m, String str, C4861j0 c4861j0, C2126h c2126h, List list2) {
        this.f6970a = (List) AbstractC3718s.m18083l(list);
        this.f6971b = (C2135m) AbstractC3718s.m18083l(c2135m);
        this.f6972c = AbstractC3718s.m18077f(str);
        this.f6973d = c4861j0;
        this.f6974e = c2126h;
        this.f6975f = (List) AbstractC3718s.m18083l(list2);
    }

    /* JADX INFO: renamed from: U */
    public static C2134l m8738U(zzaas zzaasVar, FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u) {
        List<AbstractC4817C> listZzc = zzaasVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (AbstractC4817C abstractC4817C : listZzc) {
            if (abstractC4817C instanceof C4827K) {
                arrayList.add((C4827K) abstractC4817C);
            }
        }
        List<AbstractC4817C> listZzc2 = zzaasVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC4817C abstractC4817C2 : listZzc2) {
            if (abstractC4817C2 instanceof C4830N) {
                arrayList2.add((C4830N) abstractC4817C2);
            }
        }
        return new C2134l(arrayList, C2135m.m8740T(zzaasVar.zzc(), zzaasVar.zzb()), firebaseAuth.m21988d().m7406o(), zzaasVar.zza(), (C2126h) abstractC4880u, arrayList2);
    }

    @Override // com.google.firebase.auth.AbstractC4818D
    /* JADX INFO: renamed from: T */
    public final AbstractC4819E mo8739T() {
        return this.f6971b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, this.f6970a, false);
        AbstractC1947c.m8042C(parcel, 2, mo8739T(), i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.f6972c, false);
        AbstractC1947c.m8042C(parcel, 4, this.f6973d, i7, false);
        AbstractC1947c.m8042C(parcel, 5, this.f6974e, i7, false);
        AbstractC1947c.m8048I(parcel, 6, this.f6975f, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
