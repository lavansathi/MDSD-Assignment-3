/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "math";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/Math";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "math";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathPackage eINSTANCE = dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__VARIABLES = 1;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.BindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__NAME = 0;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl <em>Var Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVarBinding()
   * @generated
   */
  int VAR_BINDING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING__NAME = BINDING__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING__EXPRESSION = BINDING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
   * @generated
   */
  int LET_BINDING = 3;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__BINDING = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__BODY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Let Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
   * @generated
   */
  int VARIABLE_USE = 5;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 6;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 7;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MultiplyImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 8;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.DivisionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 9;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathNumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MathNumberImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathNumber()
   * @generated
   */
  int MATH_NUMBER = 10;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_NUMBER__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
   * @generated
   */
  int PARENTHESIS = 11;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS__EXP = EXPRESSION__EXP;

  /**
   * The number of structural features of the '<em>Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.MathExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.MathExp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getName()
   * @see #getMathExp()
   * @generated
   */
  EAttribute getMathExp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.math.MathExp#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getVariables()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Variables();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VarBinding <em>Var Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VarBinding
   * @generated
   */
  EClass getVarBinding();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.VarBinding#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VarBinding#getExpression()
   * @see #getVarBinding()
   * @generated
   */
  EReference getVarBinding_Expression();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Expression#getExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.LetBinding <em>Let Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding
   * @generated
   */
  EClass getLetBinding();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding#getBinding()
   * @see #getLetBinding()
   * @generated
   */
  EReference getLetBinding_Binding();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetBinding#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding#getBody()
   * @see #getLetBinding()
   * @generated
   */
  EReference getLetBinding_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Binding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Binding#getName()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VariableUse <em>Variable Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Use</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse
   * @generated
   */
  EClass getVariableUse();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.mdsd.math.VariableUse#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse#getRef()
   * @see #getVariableUse()
   * @generated
   */
  EReference getVariableUse_Ref();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.MathNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathNumber
   * @generated
   */
  EClass getMathNumber();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.MathNumber#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathNumber#getValue()
   * @see #getMathNumber()
   * @generated
   */
  EAttribute getMathNumber_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Parenthesis
   * @generated
   */
  EClass getParenthesis();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathFactory getMathFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_EXP__NAME = eINSTANCE.getMathExp_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__VARIABLES = eINSTANCE.getMathExp_Variables();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl <em>Var Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVarBinding()
     * @generated
     */
    EClass VAR_BINDING = eINSTANCE.getVarBinding();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_BINDING__EXPRESSION = eINSTANCE.getVarBinding_Expression();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
     * @generated
     */
    EClass LET_BINDING = eINSTANCE.getLetBinding();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_BINDING__BINDING = eINSTANCE.getLetBinding_Binding();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_BINDING__BODY = eINSTANCE.getLetBinding_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.BindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
     * @generated
     */
    EClass VARIABLE_USE = eINSTANCE.getVariableUse();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_USE__REF = eINSTANCE.getVariableUse_Ref();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MultiplyImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.DivisionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathNumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MathNumberImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathNumber()
     * @generated
     */
    EClass MATH_NUMBER = eINSTANCE.getMathNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_NUMBER__VALUE = eINSTANCE.getMathNumber_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
     * @generated
     */
    EClass PARENTHESIS = eINSTANCE.getParenthesis();

  }

} //MathPackage
