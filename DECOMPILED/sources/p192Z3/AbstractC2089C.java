package p192Z3;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzahy;
import com.google.android.gms.internal.p411firebaseauthapi.zzaiz;
import com.google.firebase.auth.AbstractC4817C;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Z3.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2089C {
    /* JADX INFO: renamed from: a */
    public static AbstractC4817C m8625a(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            return new C4827K(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), AbstractC3718s.m18077f(zzahyVar.zze()));
        }
        if (zzahyVar.zzb() != null) {
            return new C4830N(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), (zzaiz) AbstractC3718s.m18084m(zzahyVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static List m8626b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4817C abstractC4817CM8625a = m8625a((zzahy) it.next());
            if (abstractC4817CM8625a != null) {
                arrayList.add(abstractC4817CM8625a);
            }
        }
        return arrayList;
    }
}
