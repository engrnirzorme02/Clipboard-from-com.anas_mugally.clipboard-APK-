package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p111O.AbstractC1030Z;
import p111O.C1041d;

/* JADX INFO: renamed from: androidx.appcompat.widget.v */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2373v {

    /* JADX INFO: renamed from: androidx.appcompat.widget.v$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static boolean m10151a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                AbstractC1030Z.m4454Z(textView, new C1041d.a(dragEvent.getClipData(), 3).m4644a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        /* JADX INFO: renamed from: b */
        static boolean m10152b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            AbstractC1030Z.m4454Z(view, new C1041d.a(dragEvent.getClipData(), 3).m4644a());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m10148a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC1030Z.m4429C(view) != null) {
            Activity activityM10150c = m10150c(view);
            if (activityM10150c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m10151a(dragEvent, (TextView) view, activityM10150c) : a.m10152b(dragEvent, view, activityM10150c);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static boolean m10149b(TextView textView, int i7) {
        if (Build.VERSION.SDK_INT >= 31 || AbstractC1030Z.m4429C(textView) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            AbstractC1030Z.m4454Z(textView, new C1041d.a(primaryClip, 1).m4646c(i7 != 16908322 ? 1 : 0).m4644a());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static Activity m10150c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
