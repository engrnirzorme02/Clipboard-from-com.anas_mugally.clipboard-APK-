package p247g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p239f.C5380a;
import p239f.C5387h;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5450d extends AbstractC5447a {

    /* JADX INFO: renamed from: a */
    public static final a f20743a = new a(null);

    /* JADX INFO: renamed from: g.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo12416a(Context context, C5387h input) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        AbstractC6118n.m27186d(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5380a mo12417c(int i7, Intent intent) {
        return new C5380a(i7, intent);
    }
}
