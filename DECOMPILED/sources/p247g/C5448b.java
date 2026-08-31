package p247g;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.AbstractC2436b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5448b extends AbstractC5447a {

    /* JADX INFO: renamed from: a */
    public static final a f20741a = new a(null);

    /* JADX INFO: renamed from: g.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m24658a(String[] input) {
            AbstractC6118n.m27187e(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC6118n.m27186d(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo12416a(Context context, String[] input) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(input, "input");
        return f20741a.m24658a(input);
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC5447a.a mo24653b(Context context, String[] input) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(input, "input");
        if (input.length == 0) {
            return new AbstractC5447a.a(AbstractC1610H.m6626h());
        }
        for (String str : input) {
            if (AbstractC2436b.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5905g.m26654b(AbstractC1610H.m6623e(input.length), 16));
        for (String str2 : input) {
            C1435m c1435mM6083a = AbstractC1440r.m6083a(str2, Boolean.TRUE);
            linkedHashMap.put(c1435mM6083a.m6070c(), c1435mM6083a.m6071d());
        }
        return new AbstractC5447a.a(linkedHashMap);
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map mo12417c(int i7, Intent intent) {
        if (i7 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return AbstractC1610H.m6626h();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i8 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i8 == 0));
            }
            return AbstractC1610H.m6634p(AbstractC1638q.m6600n0(AbstractC1631j.m6745r(stringArrayExtra), arrayList));
        }
        return AbstractC1610H.m6626h();
    }
}
