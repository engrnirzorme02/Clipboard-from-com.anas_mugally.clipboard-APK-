package p118P;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: P.t */
/* JADX INFO: loaded from: classes.dex */
public class C1171t {

    /* JADX INFO: renamed from: a */
    private final Object f4138a;

    /* JADX INFO: renamed from: P.t$a */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        final C1171t f4139a;

        a(C1171t c1171t) {
            this.f4139a = c1171t;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
            C1170s c1170sMo5115b = this.f4139a.mo5115b(i7);
            if (c1170sMo5115b == null) {
                return null;
            }
            return c1170sMo5115b.m5041Q0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i7) {
            List listM5116c = this.f4139a.m5116c(str, i7);
            if (listM5116c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listM5116c.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((C1170s) listM5116c.get(i8)).m5041Q0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i7) {
            C1170s c1170sMo5117d = this.f4139a.mo5117d(i7);
            if (c1170sMo5117d == null) {
                return null;
            }
            return c1170sMo5117d.m5041Q0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i7, int i8, Bundle bundle) {
            return this.f4139a.mo5119f(i7, i8, bundle);
        }
    }

    /* JADX INFO: renamed from: P.t$b */
    static class b extends a {
        b(C1171t c1171t) {
            super(c1171t);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4139a.m5114a(i7, C1170s.m4998R0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1171t() {
        this.f4138a = new b(this);
    }

    /* JADX INFO: renamed from: a */
    public void m5114a(int i7, C1170s c1170s, String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public C1170s mo5115b(int i7) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List m5116c(String str, int i7) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C1170s mo5117d(int i7) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m5118e() {
        return this.f4138a;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo5119f(int i7, int i8, Bundle bundle) {
        return false;
    }

    public C1171t(Object obj) {
        this.f4138a = obj;
    }
}
