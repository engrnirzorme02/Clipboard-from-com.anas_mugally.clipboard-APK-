package p015B5;

import androidx.fragment.app.AbstractComponentCallbacksC2591i;

/* JADX INFO: renamed from: B5.b */
/* JADX INFO: loaded from: classes.dex */
public class C0092b extends AbstractComponentCallbacksC2591i {
    /* JADX INFO: renamed from: Q1 */
    public AbstractActivityC0091a m367Q1() {
        if (m12184m() instanceof AbstractActivityC0091a) {
            return (AbstractActivityC0091a) m12184m();
        }
        throw new IllegalStateException("SlideFragment's must be attached to an IntroActivity.");
    }

    /* JADX INFO: renamed from: R1 */
    public void m368R1() {
        m367Q1().m361y1();
    }
}
