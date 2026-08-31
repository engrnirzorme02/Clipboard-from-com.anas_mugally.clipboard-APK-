package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: K */
    private final Chip f18181K;

    /* JADX INFO: renamed from: L */
    private final Chip f18182L;

    /* JADX INFO: renamed from: M */
    private final ClockHandView f18183M;

    /* JADX INFO: renamed from: N */
    private final ClockFaceView f18184N;

    /* JADX INFO: renamed from: O */
    private final MaterialButtonToggleGroup f18185O;

    /* JADX INFO: renamed from: P */
    private final View.OnClickListener f18186P;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class ViewOnClickListenerC4665a implements View.OnClickListener {
        ViewOnClickListenerC4665a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.m21783E(TimePickerView.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C4666b extends GestureDetector.SimpleOnGestureListener {
        C4666b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.m21784F(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class ViewOnTouchListenerC4667c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ GestureDetector f18189a;

        ViewOnTouchListenerC4667c(GestureDetector gestureDetector) {
            this.f18189a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f18189a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$d */
    interface InterfaceC4668d {
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface InterfaceC4669e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: E */
    static /* synthetic */ InterfaceC4669e m21783E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: F */
    static /* synthetic */ InterfaceC4668d m21784F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: G */
    private void m21785G() {
        Chip chip = this.f18181K;
        int i7 = AbstractC6746g.f26405M;
        chip.setTag(i7, 12);
        this.f18182L.setTag(i7, 10);
        this.f18181K.setOnClickListener(this.f18186P);
        this.f18182L.setOnClickListener(this.f18186P);
        this.f18181K.setAccessibilityClassName("android.view.View");
        this.f18182L.setAccessibilityClassName("android.view.View");
    }

    /* JADX INFO: renamed from: H */
    private void m21786H() {
        ViewOnTouchListenerC4667c viewOnTouchListenerC4667c = new ViewOnTouchListenerC4667c(new GestureDetector(getContext(), new C4666b()));
        this.f18181K.setOnTouchListener(viewOnTouchListenerC4667c);
        this.f18182L.setOnTouchListener(viewOnTouchListenerC4667c);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            this.f18182L.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18186P = new ViewOnClickListenerC4665a();
        LayoutInflater.from(context).inflate(AbstractC6748i.f26470s, this);
        this.f18184N = (ClockFaceView) findViewById(AbstractC6746g.f26428k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC6746g.f26431n);
        this.f18185O = materialButtonToggleGroup;
        materialButtonToggleGroup.m19746q(new MaterialButtonToggleGroup.InterfaceC4434b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC4434b
            /* JADX INFO: renamed from: a */
            public final void mo19750a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i8, boolean z7) {
                this.f18204a.getClass();
            }
        });
        this.f18181K = (Chip) findViewById(AbstractC6746g.f26434q);
        this.f18182L = (Chip) findViewById(AbstractC6746g.f26432o);
        this.f18183M = (ClockHandView) findViewById(AbstractC6746g.f26429l);
        m21786H();
        m21785G();
    }
}
