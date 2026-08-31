package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C2361k;
import com.google.android.material.internal.AbstractC4532h;
import com.google.android.material.internal.AbstractC4543s;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends C2361k {

    /* JADX INFO: renamed from: r */
    private final Rect f17912r;

    /* JADX INFO: renamed from: s */
    private boolean f17913s;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m21416e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f17913s;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m21416e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f17912r);
        rect.bottom = this.f17912r.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m21416e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.m21488U()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m21488U() && super.getHint() == null && AbstractC4532h.m20709d()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C2361k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m21416e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f17912r.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f17912r);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z7) {
        this.f17913s = z7;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20950A);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i7) {
        super(AbstractC0842a.m3884d(context, attributeSet, i7, 0), attributeSet, i7);
        this.f17912r = new Rect();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26963k8, i7, AbstractC6751l.f26548m, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM20818i.getBoolean(AbstractC6752m.f26974l8, false));
        typedArrayM20818i.recycle();
    }
}
