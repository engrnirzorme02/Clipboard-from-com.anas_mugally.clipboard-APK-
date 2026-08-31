package p189Z0;

import android.content.Context;
import com.anas_mugally.clipboard.R;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: Z0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2072h extends AbstractC2066b {

    /* JADX INFO: renamed from: n */
    private HashSet f6839n;

    /* JADX INFO: renamed from: o */
    private boolean f6840o;

    /* JADX INFO: renamed from: Z0.h$a */
    public interface a {
        /* JADX INFO: renamed from: C */
        void mo8569C(AbstractC2072h abstractC2072h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2072h(Context context, boolean z7) {
        super(context, 30, context.getResources().getConfiguration().orientation == 1 ? R.layout.admob_naitve_large : R.layout.admob_naitve_small_support_light, z7, Integer.valueOf(context.getResources().getConfiguration().orientation == 1 ? R.layout.myapp_naitve_big : R.layout.myapp_naitve_small_support_light), z7);
        AbstractC6118n.m27187e(context, "context");
        this.f6839n = new HashSet();
    }

    /* JADX INFO: renamed from: M */
    public final HashSet m8566M() {
        return this.f6839n;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m8567N() {
        return this.f6840o;
    }

    /* JADX INFO: renamed from: O */
    public final void m8568O(boolean z7) {
        this.f6840o = z7;
        if (z7) {
            this.f6839n.clear();
        }
        m13322l();
    }
}
