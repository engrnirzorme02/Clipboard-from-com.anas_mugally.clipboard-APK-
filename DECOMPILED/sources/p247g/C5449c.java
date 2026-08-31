package p247g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p239f.C5380a;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5449c extends AbstractC5447a {

    /* JADX INFO: renamed from: a */
    public static final a f20742a = new a(null);

    /* JADX INFO: renamed from: g.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo12416a(Context context, Intent input) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(input, "input");
        return input;
    }

    @Override // p247g.AbstractC5447a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5380a mo12417c(int i7, Intent intent) {
        return new C5380a(i7, intent);
    }
}
