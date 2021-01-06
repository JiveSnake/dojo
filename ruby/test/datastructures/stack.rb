require 'minitest/autorun'
require_relative '../../lib/datastructures/stack'
 
class TestStack < Minitest::Test
  def setup
    @stack = Stack.new
  end

  def test_that_stack_is_pushable
    @stack.push(1)
    assert_equal @stack.instance_variable_get(:@store), [1]
  end
  
  def test_that_stack_is_pushable_multiple_times
    @stack.push(1)
    @stack.push(2)
    @stack.push(3)
    @stack.push(4)
    assert_equal @stack.store, [1,2,3,4]
  end

  def test_that_stack_is_popable
    @stack.push(1)
    @stack.push(2)
    @stack.push(3)
    @stack.push(4)
    assert_equal @stack.store, [1,2,3,4]
    @stack.pop
    assert_equal @stack.store, [1,2,3]
  end

  def test_that_stack_pops_from_the_top
    @stack.push(1)
    @stack.push(2)
    @stack.push(3)
    @stack.push(4)
    assert_equal @stack.store, [1,2,3,4]
    top = @stack.pop
    assert_equal top, 4 
    assert_equal @stack.store, [1,2,3]
  end


  def test_that_stack_is_popable_multiple_times
    @stack.push(1)
    @stack.push(2)
    @stack.push(3)
    @stack.push(4)
    assert_equal @stack.store, [1,2,3,4]
    @stack.pop
    @stack.pop
    @stack.pop
    @stack.pop
    assert_equal @stack.store, []
  end
end
