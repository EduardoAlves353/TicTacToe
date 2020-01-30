// Generated code from Butter Knife. Do not modify!
package br.edu.fatec.aula01.tictactoe;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165287;

  private View view2131165214;

  private View view2131165215;

  private View view2131165216;

  private View view2131165217;

  private View view2131165218;

  private View view2131165219;

  private View view2131165220;

  private View view2131165221;

  private View view2131165222;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.reini, "method 'reinicia'");
    view2131165287 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reinicia();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_00, "method 'button01'");
    view2131165214 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button01();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_01, "method 'button02'");
    view2131165215 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button02();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_02, "method 'button03'");
    view2131165216 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button03();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_10, "method 'button04'");
    view2131165217 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button04();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_11, "method 'button05'");
    view2131165218 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button05();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_12, "method 'button06'");
    view2131165219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button06();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_20, "method 'button07'");
    view2131165220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button07();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_21, "method 'button08'");
    view2131165221 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button08();
      }
    });
    view = Utils.findRequiredView(source, R.id.b_22, "method 'button09'");
    view2131165222 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.button09();
      }
    });
    target.buttons = Utils.listOf(
        Utils.findRequiredViewAsType(source, R.id.b_00, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_01, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_02, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_10, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_11, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_12, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_20, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_21, "field 'buttons'", Button.class), 
        Utils.findRequiredViewAsType(source, R.id.b_22, "field 'buttons'", Button.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttons = null;

    view2131165287.setOnClickListener(null);
    view2131165287 = null;
    view2131165214.setOnClickListener(null);
    view2131165214 = null;
    view2131165215.setOnClickListener(null);
    view2131165215 = null;
    view2131165216.setOnClickListener(null);
    view2131165216 = null;
    view2131165217.setOnClickListener(null);
    view2131165217 = null;
    view2131165218.setOnClickListener(null);
    view2131165218 = null;
    view2131165219.setOnClickListener(null);
    view2131165219 = null;
    view2131165220.setOnClickListener(null);
    view2131165220 = null;
    view2131165221.setOnClickListener(null);
    view2131165221 = null;
    view2131165222.setOnClickListener(null);
    view2131165222 = null;
  }
}
