package p118P;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: P.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153b {
    /* JADX INFO: renamed from: a */
    public static int m4979a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static void m4980b(AccessibilityEvent accessibilityEvent, int i7) {
        accessibilityEvent.setContentChangeTypes(i7);
    }
}
