package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p111O.C1041d;
import p111O.InterfaceC0995H;

/* JADX INFO: renamed from: androidx.core.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2459j implements InterfaceC0995H {
    /* JADX INFO: renamed from: b */
    private static CharSequence m10784b(Context context, ClipData.Item item, int i7) {
        if ((i7 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    /* JADX INFO: renamed from: c */
    private static void m10785c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // p111O.InterfaceC0995H
    /* JADX INFO: renamed from: a */
    public C1041d mo4371a(View view, C1041d c1041d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1041d);
        }
        if (c1041d.m4642d() == 2) {
            return c1041d;
        }
        ClipData clipDataM4640b = c1041d.m4640b();
        int iM4641c = c1041d.m4641c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z7 = false;
        for (int i7 = 0; i7 < clipDataM4640b.getItemCount(); i7++) {
            CharSequence charSequenceM10784b = m10784b(context, clipDataM4640b.getItemAt(i7), iM4641c);
            if (charSequenceM10784b != null) {
                if (z7) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceM10784b);
                } else {
                    m10785c(editable, charSequenceM10784b);
                    z7 = true;
                }
            }
        }
        return null;
    }
}
