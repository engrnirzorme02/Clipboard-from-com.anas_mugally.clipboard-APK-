package p111O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p009B.AbstractC0040c;
import p118P.C1170s;
import p118P.C1171t;

/* JADX INFO: renamed from: O.a */
/* JADX INFO: loaded from: classes.dex */
public class C1032a {

    /* JADX INFO: renamed from: c */
    private static final View.AccessibilityDelegate f3822c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    private final View.AccessibilityDelegate f3823a;

    /* JADX INFO: renamed from: b */
    private final View.AccessibilityDelegate f3824b;

    /* JADX INFO: renamed from: O.a$a */
    static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        final C1032a f3825a;

        a(C1032a c1032a) {
            this.f3825a = c1032a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3825a.mo4581a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1171t c1171tMo4582b = this.f3825a.mo4582b(view);
            if (c1171tMo4582b != null) {
                return (AccessibilityNodeProvider) c1171tMo4582b.m5118e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3825a.mo4584f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1170s c1170sM4998R0 = C1170s.m4998R0(accessibilityNodeInfo);
            c1170sM4998R0.m5021G0(AbstractC1030Z.m4446R(view));
            c1170sM4998R0.m5086w0(AbstractC1030Z.m4442N(view));
            c1170sM4998R0.m5012B0(AbstractC1030Z.m4483o(view));
            c1170sM4998R0.m5033M0(AbstractC1030Z.m4434F(view));
            this.f3825a.mo4585g(view, c1170sM4998R0);
            c1170sM4998R0.m5056e(accessibilityNodeInfo.getText(), view);
            List listM4578c = C1032a.m4578c(view);
            for (int i7 = 0; i7 < listM4578c.size(); i7++) {
                c1170sM4998R0.m5052b((C1170s.a) listM4578c.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3825a.mo4586h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3825a.mo4587i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f3825a.mo4588j(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f3825a.mo4589l(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3825a.mo4590m(view, accessibilityEvent);
        }
    }

    public C1032a() {
        this(f3822c);
    }

    /* JADX INFO: renamed from: c */
    static List m4578c(View view) {
        List list = (List) view.getTag(AbstractC0040c.f291H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: e */
    private boolean m4579e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM5007r = C1170s.m5007r(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; clickableSpanArrM5007r != null && i7 < clickableSpanArrM5007r.length; i7++) {
                if (clickableSpan.equals(clickableSpanArrM5007r[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4580k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC0040c.f292I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m4579e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4581a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3823a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C1171t mo4582b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3823a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1171t(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    View.AccessibilityDelegate m4583d() {
        return this.f3824b;
    }

    /* JADX INFO: renamed from: f */
    public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3823a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public void mo4585g(View view, C1170s c1170s) {
        this.f3823a.onInitializeAccessibilityNodeInfo(view, c1170s.m5041Q0());
    }

    /* JADX INFO: renamed from: h */
    public void mo4586h(View view, AccessibilityEvent accessibilityEvent) {
        this.f3823a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: i */
    public boolean mo4587i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3823a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo4588j(View view, int i7, Bundle bundle) {
        List listM4578c = m4578c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i8 = 0; i8 < listM4578c.size(); i8++) {
            C1170s.a aVar = (C1170s.a) listM4578c.get(i8);
            if (aVar.m5094b() == i7) {
                zPerformAccessibilityAction = aVar.m5096d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3823a.performAccessibilityAction(view, i7, bundle);
        }
        return (zPerformAccessibilityAction || i7 != AbstractC0040c.f304a || bundle == null) ? zPerformAccessibilityAction : m4580k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* JADX INFO: renamed from: l */
    public void mo4589l(View view, int i7) {
        this.f3823a.sendAccessibilityEvent(view, i7);
    }

    /* JADX INFO: renamed from: m */
    public void mo4590m(View view, AccessibilityEvent accessibilityEvent) {
        this.f3823a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1032a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3823a = accessibilityDelegate;
        this.f3824b = new a(this);
    }
}
