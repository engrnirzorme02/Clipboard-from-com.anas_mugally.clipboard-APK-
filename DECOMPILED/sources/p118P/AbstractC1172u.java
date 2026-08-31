package p118P;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: P.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1172u {
    /* JADX INFO: renamed from: a */
    public static void m5120a(AccessibilityRecord accessibilityRecord, int i7) {
        accessibilityRecord.setMaxScrollX(i7);
    }

    /* JADX INFO: renamed from: b */
    public static void m5121b(AccessibilityRecord accessibilityRecord, int i7) {
        accessibilityRecord.setMaxScrollY(i7);
    }

    /* JADX INFO: renamed from: c */
    public static void m5122c(AccessibilityRecord accessibilityRecord, View view, int i7) {
        accessibilityRecord.setSource(view, i7);
    }
}
