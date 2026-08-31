package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p314o2.C6570v;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3365l2 {

    /* JADX INFO: renamed from: a */
    public static final C3365l2 f14001a = new C3365l2();

    protected C3365l2() {
    }

    /* JADX INFO: renamed from: a */
    public final C3349h2 m17269a(Context context, C3368m1 c3368m1) {
        String strM33290y;
        String strM17270a = c3368m1.m17270a();
        Set setM17272c = c3368m1.m17272c();
        List listUnmodifiableList = !setM17272c.isEmpty() ? Collections.unmodifiableList(new ArrayList(setM17272c)) : null;
        boolean zM17276g = c3368m1.m17276g(context);
        Bundle bundleM17273d = c3368m1.m17273d(AdMobAdapter.class);
        String strM17274e = c3368m1.m17274e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C3244B.m17190a();
            strM33290y = C7590g.m33290y(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strM33290y = null;
        }
        boolean zM17281l = c3368m1.m17281l();
        C6570v c6570vM17336j = C3407w1.m17330e().m17336j();
        return new C3349h2(8, -1L, bundleM17273d, -1, listUnmodifiableList, zM17276g, Math.max(c3368m1.m17278i(), c6570vM17336j.m27856c()), false, strM17274e, null, null, strM17270a, c3368m1.m17277h(), c3368m1.m17279j(), Collections.unmodifiableList(new ArrayList(c3368m1.m17280k())), c3368m1.m17275f(), strM33290y, zM17281l, null, c6570vM17336j.m27857d(), (String) Collections.max(Arrays.asList(null, c6570vM17336j.m27854a()), C3361k2.f13982a), c3368m1.m17271b(), c3368m1.m17283n(), c3368m1.m17282m(), c6570vM17336j.m27855b().m27860c(), c3368m1.m17285p(), c3368m1.m17286q());
    }
}
