package p017C;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: C.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0113n {

    /* JADX INFO: renamed from: a */
    private static final Object f635a = new Object();

    /* JADX INFO: renamed from: b */
    private static final Object f636b = new Object();

    /* JADX INFO: renamed from: a */
    static Bundle m537a(AbstractC0111l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM437d = aVar.m437d();
        bundle.putInt("icon", iconCompatM437d != null ? iconCompatM437d.m10606e() : 0);
        bundle.putCharSequence("title", aVar.m441h());
        bundle.putParcelable("actionIntent", aVar.m434a());
        Bundle bundle2 = aVar.m436c() != null ? new Bundle(aVar.m436c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m435b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m539c(aVar.m438e()));
        bundle.putBoolean("showsUserInterface", aVar.m440g());
        bundle.putInt("semanticAction", aVar.m439f());
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    private static Bundle m538b(AbstractC0119t abstractC0119t) {
        new Bundle();
        throw null;
    }

    /* JADX INFO: renamed from: c */
    private static Bundle[] m539c(AbstractC0119t[] abstractC0119tArr) {
        if (abstractC0119tArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC0119tArr.length];
        for (int i7 = 0; i7 < abstractC0119tArr.length; i7++) {
            AbstractC0119t abstractC0119t = abstractC0119tArr[i7];
            bundleArr[i7] = m538b(null);
        }
        return bundleArr;
    }
}
